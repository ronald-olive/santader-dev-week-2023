# Santader Dev Deek 2023
JavaRESTful API criada para a Santander Dev Week.

## Diagrama de Classes

```mermaidclassDiagram
    class User {
        string name
        Account account
        Feature[] features
        Card card
        News[] news
    }
    class Account {
        string number
        string agency
        float balance
        float limit
    }
    class Feature {
        string icon
        string description
    }
    class Card {
        string number
        float limit
    }
    class News {
        string icon
        string description
    }

User --> Acount
User --> Feature
User --> Card
User --> News
```

