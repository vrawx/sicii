-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
INSERT INTO TIPOUSUARIO(tipcodigo, sigla, descricao, cadastradoem, cadastradopor, alteradoem, alteradopor) VALUES(0001, 'sigla', 'descrito', now(), NULL , now(), NULL)

INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(nextval('usuariosequencepostgres'), 'vcorrea', 'vcorrea', now(), NULL, now(), NULL);
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(nextval('usuariosequencepostgres'), 'gerodf' , 'gerodf', now(), 1, now(), 1);

INSERT INTO ENDERECO VALUES (nextval('enderecosequencepostgres'),now(), now(), 'bairro', 'cidade', 'df', 'logradouro', 1, 1);

INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '128312', false, now(), 'jose', 'maeJose', 'paiJose', '21323', '12342', 'masculino', 1, 1, 1);
INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '767945', false, now(), 'maria', 'maeMaria', 'paiMaria', '214734', '16772', 'feminino', 2, 2, 1);

INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', 'detran', 0, 1, 1);
INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', '9 BPM', 0, 2, 2);

INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'EVENTO INVESTIGACAO' , 1, 'EVENTO', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'ANDAMENTO EVENTO', 1, 'ANDAMENTO', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'EVENTO ENCERRADO', 1, 'CONCLUSO', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'INVESTIGACAO EFETUADA', 4, 'INVESTIGACAO', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'ANDAMENTO INVESTIGACAO', 4, 'ANALISE', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'ANDAMENTO INVESTIGACAO', 4, 'APTO', 1, 1);
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), now(), now(), 'ANDAMENTO INVESTIGACAO', 4, 'INAPTO', 1, 1);

INSERT INTO AGENCIA VALUES (nextval('agenciasequencepostgres'), now(), now(), true, 0, 2, 2, 1);

INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Operacoes', 'DOP', true, 1, 1, 1);
INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Controle de Armas', 'DCAM', true, 1, 1, 1);
INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Tecnologia', 'DTEC', true, 1, 1, 1);

INSERT INTO FUNCAOUSUARIO VALUES (nextval('funcaosequencepostgres'), now(), now(), 'Chefe', 'CHEFE', 1, 1);

INSERT INTO USUARIOASSESSORIA VALUES (nextval('usuarioassessoriapostgres'), now(), now(), true, 1, 1, 1, 1, 1);
INSERT INTO USUARIOASSESSORIA VALUES (nextval('usuarioassessoriapostgres'), now(), now(), true, 1, 2, 1, 1, 2);


INSERT INTO PARECER VALUES (nextval('parecerSequencePostgres'), now(), now(),'parecer evento', 1, 1, 1);
INSERT INTO PARECER VALUES (nextval('parecerSequencePostgres'), now(), now(),'parecer investigacao', 1, 1, 1);
INSERT INTO PARECER VALUES (nextval('parecerSequencePostgres'), now(), now(),'parecer pesquisa', 1, 1, 1);

INSERT INTO EVENTOINVESTIGACAO VALUES (nextval('eventoSequencePostgres'), now(), now(), 1985, 'Evento Investigacao 1985-498398', 498398, 1, 1, 2, 3, 1);
INSERT INTO EVENTOINVESTIGACAO VALUES (nextval('eventoSequencePostgres'), now(), now(), 1979, 'Evento Investigacao 1979-498388', 498388, 1, 1, 2, 3, 1);

INSERT INTO INVESTIGACAO VALUES (nextval('investigacaosequencepostgres'), now(), now(), 1, 1, 1, 1, 2);
INSERT INTO INVESTIGACAO VALUES (nextval('investigacaosequencepostgres'), now(), now(), 1, 1, 1, 1, 3);
INSERT INTO INVESTIGACAO VALUES (nextval('investigacaosequencepostgres'), now(), now(), 1, 1, 1, 1, 1);

