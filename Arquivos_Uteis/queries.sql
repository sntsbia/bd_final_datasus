-- Listar todas os sintomas
SELECT * FROM Sintomas;

-- Listar todos municípios com pelo menos um caso:
SELECT * FROM Municipio inner join Ocorre on Ocorre.fk_id_Municipio = Municipio.id_Municipio;

-- qual a vacina mais aplicada por municipio:
SELECT municipio, nome_Vacina as nomeVacina, max(num_vac) as numVac FROM
    ( SELECT count(*) as num_vac, nome_Vacina, Municipio.municipio FROM
         Toma NATURAL JOIN Mora INNER JOIN Vacina ON Toma.fk_id_Vacina = Vacina.id_Vacina
         INNER JOIN Municipio ON Mora.fk_id_Municipio = Municipio.id_Municipio GROUP BY municipio) AS num_vac
    GROUP BY municipio;

-- qual o numero de pessoas que apresentaram o sintoma 'febre'
SELECT sintomas, count(*) FROM Pessoa inner join Teste on id_Pessoa = fk_id_pessoa INNER JOIN Sintomas
    ON Sintomas.fk_id_teste = Teste.id_Teste
    WHERE Sintomas.sintomas = 'febre'
    GROUP BY sintomas;

-- qual o caso mais recente por município
SELECT Data_teste, Municipio FROM Teste NATURAL JOIN Mora INNER JOIN Municipio ON id_Municipio = Mora.fk_id_Municipio WHERE Teste.resultado = 1 GROUP BY municipio;

-- mostrar idade da pessoa e data de vacinação de todas as pessoas que tomaram coronavac
SELECT idade, data FROM Toma INNER JOIN Pessoa ON Pessoa.id_Pessoa = Toma.fk_id_pessoa
    INNER JOIN Vacina ON Toma.fk_id_vacina = Vacina.id_vacina
    WHERE nome_vacina = 'SINOVAC';

-- Mostrar todas as pessoas que moram no municipio Rio de Janeiro e tem idade acima de 30.
SELECT * FROM Pessoa INNER JOIN Mora ON id_Pessoa = fk_id_pessoa
INNER JOIN Municipio ON fk_id_municipio = id_Municipio
WHERE idade > 30 AND municipio = 'Rio de Janeiro';

-- Mostrar todas as pessoas que não tomaram nenhuma dose de Vacina (OUTER JOIN)
SELECT * FROM Pessoa LEFT OUTER JOIN Toma ON Pessoa.id_Pessoa = Toma.fk_id_Pessoa WHERE fk_id_Vacina IS NULL;

-- Mostrar todos os municipios que houveram testes feitos
SELECT Municipio FROM Municipio INNER JOIN Ocorre ON Municipio.id_Municipio = Ocorre.fk_id_Municipio GROUP BY Municipio;

-- Listar todos os dias que aconteceu vacinação e/ou teste (usar distinct)
(SELECT distinct (Data_Teste) FROM Teste) UNION (SELECT distinct (Data) FROM Toma);