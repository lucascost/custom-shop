#### Nomeclatura da Base de dados
prefixo: db_
nome da base: customshop

| base | db_customshop |


Nomeclatura de Tabelas
prefixo: tbl_
colunas com mais de um substantivo: separador é o _


| nome | descricao
|------------------------|------------------------
| tbl_categoria   | Tabela para armazenar as categorias de produtos <br/> `tbl_categoria (id_categoria, nome_categoria)`
| tbl_produto   | Tabela para armazenar os dados de produtos <br/> `tbl_produto (id_produto, nome_produto, descricao_produto, preco_produto, fk_categoria)`

