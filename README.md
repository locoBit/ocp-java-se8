# OCP Java SE 8 Programmer
n2htae9e6c8x

* Inheritence

* Visibiitly
Mecanismos de proteccion para permitir el acceso

* Composition
Forma en la que se va a representar los problemas en OOP
Los objetos estan compuestos de otros objetos

* Contexto
Conjunto de elementos que tienen relacion con el tema que estes analizando

* 2.1 Clase abstracta
no puede ser instanciada
no representa algo en concreto
instancia -> crear objeto

* 2.2 The final keyword
clase -> para indicar que esta clase no transmite herencia
metodo -> no se permite la sobreescritura (override)
variables -> son constantes

* 2.4 Enums

* 2.5 Interfaces

**************** Estudiar primitivos

### Class Modifiers and Accessors
Modifiers public, private, protected
Controles de niveles de acceso: public, private, protected, default

privado: solamente en el contexto de la clase
publico: accesible desde donde sea
default: en el conexto del package
protected: mientras haya relacion de herencia

La clase solo puede ser publica o default

### Class Modifiers (Nonaccess)
* final
  * medodo: no se puede sobreescribir
  * clase: no se puede heredar
  * variable: no se le puede cambiar el valor
  * parametro: no se le puede cambiar el valor dentro de un metodo
* abstract
  * methodo: no tiene cuerpo
  * clase: no se puede instanciar
* synchonized
  Hay procesos que ya no se dividen en mas subprocesos
  * methodo: solo un thread puede ejecutarlo en un momento en el tiempo

### Interface
* Se estan definiendo un conjunto de especificaciones que todo el mundo debe usar
* variables: publicas, static, final
* metodos: no tiene cuerpo, solo firma. Dice que debes hacer pero no dice como

Reglas que aplican en una interfaz:
* Todos los metodos son implicitamente publicos, a menos que hagas un default
* Todas las variables son public, static, final
* Puede extender una o mas interfaces
* No puede implementar otra cosa que no sea interfaz
* Pueden ser usada de manera polimorficamente

#### Default interface methods
* son publicos por definicion
* no pueden ser marcados como privatdos, proteidos, static, final ni abstract
* tienen que tener cuerpo

#### static Interface methods
* son publicos por default

### Variable
* viven dentro de un metodo
* no aplican los modificadores de acceso

from the class
form any class in package
subclass in the same package

### Methods with variable arguments
``` java
void doStuff(int... x) {}
void doStuff(int x, char... y) {}
```

#### Variable declarations (estudiar luego)
* primitites

#### Variable de instancia
* Viven dentro del objeto
* Se inicializan segun su tipo
* Se pueden los 4 niveles de acceso
* Puenden ser **final**
* Pueden ser **transient** (no se va a salvar en file system, db, )
* No pueden ser marcadas como **synchonized**
* No pueden ser marcadas como **synchonized**

Es posible tener una valiable local con el mismo nombre de una variable de instancia,
a esto se le conoce como **shadowing**

### Array declarations
```java
int[] key;
int key[];

MyObject[] obj;

String[][] myArray;
Producto[][] productosArray = new Producto[1][3];
```

### Enums
* Lista de valores

## Capitulo 2 - Orientacion a objetos
* Polimorfismo
* Encapsulaition
* Inheritence
* Overriding and Overloading
* Casting
* Use interface

