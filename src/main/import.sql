-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
INSERT INTO TIPOUSUARIO(tipcodigo, sigla, descricao, cadastradoem, cadastradopor, alteradoem, alteradopor) VALUES(0001, 'sigla', 'descrito', now(), NULL , now(), NULL)

INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(0001, 'vcorrea', 'vcorrea', now(), NULL, now(), NULL );
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(0002, 'gerodf' , 'gerodf' , now(), NULL, now(), NULL );



INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), 'bairro', now(), 'brasilia', 'df', '128312', false, 'logradouro', now(), 'jose', 'maeJose', 'paiJose', '21323', '12342', 'masculino', 1, 1);
INSERT INTO INVESTIGADO VALUES (nextval('investigadosequencepostgres'), now(), 'bairro', now(), 'brasilia', 'df', '767945', false, 'logradouro', now(), 'maria', 'maeMaria', 'paiMaria', '214734', '16772', 'feminino', 2, 2);