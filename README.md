# Actividad_diagrama_taller

He elegido una Composición porque el objeto Reparacion no puede existir de forma independiente (no tiene sentido si no existe el vehículo) . Si un vehículo se elimina, su historial de reparaciones no tendría valor y se eliminaría. Es el vehículo el que de manera vulgar decimos que posee una reparación.

El uso de la interfaz Especialista permite poder aplicar la abstracción y el polimorfismo y con esto facilita las adaptaciones de modificaciones, con lo que si queremos incorporar nuevos tipos hace que se pueda realizar la tarea sin tener la necesidad de modificar la lógica que ya existe.
