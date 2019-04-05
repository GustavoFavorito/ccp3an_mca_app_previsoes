INSERT INTO tb_dia_semana VALUES (1, 'Domingo'),(2, 'Segunda'),(3, 'Terça'),(4, 'Quarta'),(5, 'Quinta'),(6, 'Sexta'), (7, 'Sábado');

INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (1, CURRENT_DATE, 'Dia nublado', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE id = 1);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (2, '05/04/19', 'Dia chuvoso', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE id = 2);
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (3, '06/04/19', 'Dia limpo', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE dia_semana = 'Terça');
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (4, '07/04/19', 'Dia nublado', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE dia_semana = 'Quarta');
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (5, '08/04/19', 'Dia nublado', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE dia_semana = 'Quinta');
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (6, '09/04/19', 'Dia chuvoso', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE dia_semana = 'Sexta');
INSERT INTO tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) VALUES (7, '10/04/19', 'Dia limpo', CURRENT_TIME, 70, 10, 10, 21, 14, SELECT id FROM tb_dia_semana WHERE id = 7);

--adicione um usuário
insert into usuario (id, login, senha) values (1, 'admin', 'admin');