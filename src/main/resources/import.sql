--Clientes
insert into cliente(nombre, apellido, email, telefono, fechanacimiento) values ('John', 'Snow', 'jhonsnow@gmail.com', '215454', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'))
insert into cliente(nombre, apellido, email, telefono, fechanacimiento) values ('Peter', 'Gabriel', 'pgrabriel@outlook.com', '4875454454', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'))
insert into cliente(nombre, apellido, email, telefono, fechanacimiento) values ('Mariah', 'Carrey', 'maricar@gmail.com', '997454222', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'))

--Categorias
insert into categoria(id, descripcion) values (1, 'Hombre')
insert into categoria(id, descripcion) values (2, 'Mujer')

-- Productos
insert into producto(descripcion, precio, codigo, stock, categoria_id) values ('Remera Nike', 30.50, '2132154121', 20, 1)
insert into producto(descripcion, precio, codigo, stock, categoria_id) values ('Buzo Adidas', 60.25, '5485454', 5, 2)
insert into producto(descripcion, precio, codigo, stock, categoria_id) values ('Pantalon Puma', 101.66, '5454', 10, 1)
