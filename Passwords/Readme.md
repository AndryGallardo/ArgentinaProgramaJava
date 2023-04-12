## Ejercicio propuesto 3 clase 5 

Genera una clase llamada Password que siga las siguientes condiciones:

*  Que tenga los atributos longitud y contraseña. Por defecto, la longitud sera de 8.
* Los constructores serán los siguiente:
	1. Un constructor por defecto.
	2. Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud (método disponible al final del enunciado).
* Los métodos que implementa serán:
	1. esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y más de 5 números.
	2. generarPassword(): genera la contraseña del objeto con la longitud que tenga. Método get para contraseña y longitud.
	3. Método set para longitud.

Ahora, crea una clase clase ejecutable:

* Crea un array de Passwords con el tamaño que tú le indiques por teclado.
* Crea un bucle que cree un objeto para cada posición del array.
* Indica también por teclado la longitud de los Passwords (antes de bucle).
* Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
* Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:

contraseña1 valor_booleano1 

contraseña2 valor_bololeano2
