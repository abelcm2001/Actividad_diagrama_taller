```mermaid
classDiagram
    class Especialista {
        Interfaz
        +reparar(Reparacion r) void
    }

    class Taller {
        +asignarTarea(Mecanico m, Reparacion r) void
    }

    class Vehiculo {
        Abstracta
        -String matricula
        -String modelo
        +Vehiculo(String matricula, String modelo)
        +getMatricula() String
    }

    class Coche {
        +Coche(String matricula, String modelo)
    }

    class Moto {
        +Moto(String matricula,String modelo)
    }

    class Cliente {
    }

    class Mecanico {
        +reparar(Reparacion r) void
    }

    class Reparacion {
        -String Historial de reparaciones

    }
    
    Vehiculo <|-- Coche : Herencia
    Vehiculo <|-- Moto : Herencia
   
    Vehiculo "1" *-- "*" Reparacion : Composición (Fuerte)
   
    Cliente "1" --> "*" Vehiculo : Asociación (Posesión)
   
    Mecanico ..|> Especialista : Realización

    ```
   
    Taller ..> Mecanico : Dependencia
    Taller "1" *-- "*" Vehiculo : Composición (Gestión)
