-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(00001,'vcorrea', 'vcorrea', now(), NULL, now(), NULL );
INSERT INTO USUARIO(usucodigo, login, senha, alteradoem, alteradopor, cadastradoem, cadastradopor) VALUES(00002,'gerodf', 'gerodf', now(), NULL,now(), NULL );

-- INVESTIGADO

INSERT INTO INVESTIGADO(invcodigo, cpf, nome, nascimento, nomedopai, nomedamae, sexo, logradouro, bairro, cidade, cidadeuf, numerotelefone,numerocelular, cadastradoem, alteradoem, cadastradopor, alteradopor) VALUES(00001,99999999,'investigado', now(),'paiDoInvestigado','maeDoInvestigado', 'feminino', 'LOGRADOURO DO INVESTIGADO', 'BAIRRO DO INVESTIGADO', 'BRASILIA', 'DF', 99999999, 99999999, now(), now(), NULL, NULL);