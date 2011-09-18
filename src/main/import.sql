-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
INSERT INTO TIPOUSUARIO(tipcodigo, sigla, descricao, cadastradoem, cadastradopor, alteradoem, alteradopor) VALUES(0001, 'sigla', 'descrito', now(), NULL , now(), NULL)

INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(nextval('usuariosequencepostgres'), 'vcorrea', 'vcorrea', now(), NULL, now(), NULL);
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(nextval('usuariosequencepostgres'), 'gerodf' , 'gerodf', now(), 1, now(), 1);

INSERT INTO ENDERECO VALUES (nextval('enderecosequencepostgres'), 'bairro', 'cidade', 'df', 'logradouro');

INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '128312', false, now(), 'jose', 'maeJose', 'paiJose', '21323', '12342', 'masculino', 1, 1, 1);
INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '767945', false, now(), 'maria', 'maeMaria', 'paiMaria', '214734', '16772', 'feminino', 2, 2, 1);

INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', 'detran', 0, 1, 1);
INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', '9 BPM', 0, 2, 2);

INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'),'EVENTO INVESTIGACAO' , 1, 'EVENTO');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'ANDAMENTO EVENTO', 1, 'ANDAMENTO');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'EVENTO ENCERRADO', 1, 'CONCLUSO');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'INVESTIGACAO EFETUADA', 4, 'INVESTIGACAO');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'ANDAMENTO INVESTIGACAO', 4, 'ANALISE');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'ANDAMENTO INVESTIGACAO', 4, 'APTO');
INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'ANDAMENTO INVESTIGACAO', 4, 'INAPTO');

INSERT INTO AGENCIA VALUES (nextval('agenciasequencepostgres'), now(), now(), true, 0, 2, 2, 1);

INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Operacoes', 'DOP', true, 1, 1, 1);
INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Controle de Armas', 'DCAM', true, 1, 1, 1);
INSERT INTO ASSESSORIA VALUES(nextval('assessoriasequencepostgres'), now(), now(), 'Divisao de Tecnologia', 'DTEC', true, 1, 1, 1);

INSERT INTO FUNCAOUSUARIO VALUES (nextval('funcaosequencepostgres'), now(), now(), 'Chefe', 'CHEFE', 1, 1);

INSERT INTO USUARIOASSESSORIA VALUES (nextval('usuarioassessoriapostgres'), now(), now(), true, 1, 1, 1, 1, 1);

INSERT INTO PARECER VALUES (nextval('parecerSequencePostgres'), now(), now(),'parecer nao sei do que', 1, 1, 1);


