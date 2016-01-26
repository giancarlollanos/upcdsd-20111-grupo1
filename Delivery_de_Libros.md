# Introducción #

El presente trabajo tiene como finalidad la implementación de un sistema via web, de venta de libros por delivery online.



## Servicios ##

### Gestión de Usuarios(WebService): ###
Controlar los usuarios que acceden al sistema.


#### Operación Consultar: ####
Consultar Usuario.

#### Parametros: ####
Codigo de Usuario.

#### Retorno: ####
Objeto Bean de tipo usuario.


#### Operación Vaidar: ####
Validar al Usuario.

#### Parametros: ####
Login y Password.

#### Retorno: ####
Objeto Bean de tipo usuario.


#### Operación Registro: ####
Registrar Usuario.

#### Parametros: ####
Objeto Bean de tipo usuario.
(CodigoUsuario, Login, Password, Nombre, Apellido)

#### Retorno: ####
Un estado: transacción satisfactoria o no.

#### Operación Actualiación: ####
Actualizar Usuario.

#### Parametros: ####
Objeto Bean de tipo usuario.
(CodigoUsuario, Login, Password, Nombre, Apellido)

#### Retorno: ####
Un estado: transacción satisfactoria o no.


### Registro de Ventas(WebService): ###
Orquestar la transacción del proceso de venta.

#### Operación Registro: ####
Registrar Delivery.

#### Parametros: ####
Codigo de Pedido.

#### Retorno: ####
Un estado: transacción satisfactoria o no.


### Gestión de Stock(WebService): ###
Consultar la disponibilidad del libro.

#### Operación Consultar: ####
Consultar Stock.

#### Parametros: ####
Codigo de Libro.

#### Retorno: ####
Cantidad de Productos en Stock.

#### Operación Actualizar: ####
Actualizar Stock.

#### Parametros: ####
Codigo de Libro.
Cantidad.

#### Retorno: ####
Un estado: actualizo o no.


### Transacción Bancaria(Colas): ###
Verificar el descargo del deposito por el pago del servicio.

#### Operación Validar: ####
Validación de Tarjeta.

#### Parametros: ####
Número de Tarjeta.
Titular.
Fecha de Expiración.
Monto.
PIN.

#### Retorno: ####
Un estado: transacción satisfactoria o no.


## Control de Recursos(WebService): ##
Asignar al personal de reparto la entrega del producto según su dispobilidad.

#### Operación Consultar: ####
Consultar Disponibilidad.

#### Parametros: ####
Codigo de Repartidor.
Fecha.
Hora.

#### Retorno: ####
Un estado: disponible o no.