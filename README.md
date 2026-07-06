# Evaluacion Set y Map

## Metodo A: filtrarYOrdnerarTickets  

Implementacion Realizada:

- Cree un metodo q recibe un set de los tickets de soporte el cual recibe parametros de una lista de tickets y una prioridad minima
se utiliza un TreeSet el cual adentro tiene una compracion en metodo lambda para ordenar por prioridad y ver comparacion entre nombre se usa un bulce for each para 
ir recorriendo cada variable y con una condicional solo recoger los que son mayores o iguales al minimo
Explicacion :
- Utilize TreeSet el cual me ayuda a tener ya ordenado la lista y poder meter un comparador el cual si retorna 0 seguira solo con el primer dato que entro y el siguente no.utilizo un bucle para recorrer toda la lista y poder encontrar las variables que solo contengan la condicion q puse en prioridad minima. y retorno el set.
No utilizo un los demas combinaciones de Set xq no me ayudan a ordenar las variables LinkedHashSet solo hace como va entrando.

## Metodo B: agruaprCodigoPorPrioridad 
Implementacion utilizada por Map:

- Utilizo el TreeMap ya que igualmente que el anterior me deja ordenaod mis varaibles en un arbol rojo y negro, no me voy por los otros dos xq como anteriormente ninguno de los dos me deja arreglado o ordenado

Implementacion Realizada:

- Cree un metodo q recibe un Map de String y una lista de String  de soporte el cual recibe parametros de una lista de tickets 
inicializo el map en un TreeSet, el cual ya solo le llamdo y le doy las llaves q tengo como condiciones de alto , medio y bajo.Recorrro la lista con u n foreach con condiciones de los codigos y ver cada uno en una lista seteo una lista con las varaibles que cumplen lo pedido de rango creo varaible booleana para poder ver si esta o no esta en la lista y retorno el resultado en un map

