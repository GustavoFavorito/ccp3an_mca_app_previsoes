insert into tb_dia_semana values (1, 'terca');

insert into tb_previsao (id, data, desc, hora, humidade, latitude, longitude, max_temp, min_temp, dia_semana) values (2, 'data', 'desc', 'hora', 22, 22, 22, 22, 22, select id from tb_dia_semana where dia_semana = 'terca');


--adicione um usuário
insert into usuario (id, login, senha) values (1, 'admin', 'admin');