# Mappers en Java

## ¿Qué es un Mapper?

En Java, un **mapper** es una herramienta o patrón de diseño que se utiliza para transformar datos entre diferentes capas de una aplicación, generalmente entre objetos de tipo *DTO* (Data Transfer Object) y entidades del modelo de dominio. Los mappers facilitan la conversión de datos y ayudan a mantener un código limpio y mantenible.

## ¿Por qué usar Mappers?

Los mappers son útiles por varias razones:

- **Separación de Concerns**: Ayudan a mantener una clara separación entre la lógica de negocios y la lógica de datos.
- **Reducción de Código Repetitivo**: Automatizan la conversión de datos, reduciendo la necesidad de escribir código repetitivo para mapear entre tipos.
- **Facilidad de Mantenimiento**: Hacen que el código sea más fácil de mantener y extender, ya que los cambios en el modelo de datos solo requieren ajustes en el mapper, en lugar de modificar múltiples partes del código.

## ¿Cómo Funciona un Mapper?

En general, un mapper realiza las siguientes funciones:

1. **Transformación de Datos**: Convierte datos de un formato a otro. Por ejemplo, puede convertir una entidad de base de datos en un objeto DTO para la capa de presentación.
2. **Configuración de Relaciones**: Maneja las relaciones entre objetos, como listas o propiedades anidadas.
3. **Manejo de Tipos**: Asegura que los datos se transformen correctamente entre tipos de datos diferentes, como entre 'String' y 'Date'.
