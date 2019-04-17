INSERT INTO tb_dia_semana VALUES (1, 'Domingo'),(2, 'Segunda'),(3, 'Terça'),(4, 'Quarta'),(5, 'Quinta'),(6, 'Sexta'), (7, 'Sábado');
--
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (1, 'Sao Paulo', 37, -122);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (2, 'Peruibe', 38, -123);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (3, 'Rio de Janeiro', 39, -124);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (4, 'Belo Horizonte', 40, -125);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (5, 'Piraporinha', 41, -126);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (6, 'Diadema', 42, -127);
INSERT INTO tb_cidade (id, nome, latitude, longitude) VALUES (7, 'Sao Carlos', 43, -128);

INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (1, '27/09/1998', 'Dia nublado', '11:30', 70, 21, 14, 1, 1);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (2, '05/04/2005', 'Dia chuvoso', '10:25', 70, 21, 14, 2, 1);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (3, '06/04/2004', 'Dia limpo',   '11:00', 70, 21, 14, 3, 2);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (4, '07/04/2007', 'Dia nublado', '12:45', 70, 21, 14, 4, 3);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (5, '08/04/2007', 'Dia nublado', '7:50',  70, 21, 14, 5, 4);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (6, '09/04/2008', 'Dia chuvoso', '9:40',  70, 21, 14, 6, 4);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, max_temp, min_temp, id_dia_semana, id_cidade) VALUES (7, '10/04/2007', 'Dia limpo',   '8:10',  70, 21, 14, 7, 6);

-- --adicione um usuário
insert into usuario (id, login, senha) values (1, 'admin', 'admin');
