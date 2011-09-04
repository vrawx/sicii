-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
INSERT INTO TIPOUSUARIO(tipcodigo, sigla, descricao, cadastradoem, cadastradopor, alteradoem, alteradopor) VALUES(0001, 'sigla', 'descrito', now(), NULL , now(), NULL)

INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(0001, 'vcorrea', 'vcorrea', now(), NULL, now(), NULL );
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(0002, 'gerodf' , 'gerodf' , now(), NULL, now(), NULL );

INSERT INTO ENDERECO VALUES (nextval('enderecosequencepostgres'), 'bairro', 'cidade', 'df', 'logradouro');

INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '128312', false, now(), 'jose', 'maeJose', 'paiJose', '21323', '12342', 'masculino', 1, 1, 1);
INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), now(), '767945', false, now(), 'maria', 'maeMaria', 'paiMaria', '214734', '16772', 'feminino', 2, 2, 1);

INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', 'detran', 0, 1, 1);
INSERT INTO ORGANIZACAO VALUES (nextval('organizacaosequencepostgres'), now(), now(), 'descricao organizacao', '9 BPM', 0, 2, 2);


INSERT INTO SITUACAO VALUES (nextval('situacaosequencepostgres'), 'Descricao Situacao', 'ATIVA', 0);
INSERT INTO AGENCIA VALUES (nextval('agenciasequencepostgres'), now(), now(), true, 0, 2, 2, 1);


INSERT INTO EVENTOINVESTIGACAO VALUES (nextval('eventosequencepostgres'), now(), 1988, now(), 'descricao evento', 1944, 1, 2, 2, 1, null, 1);
