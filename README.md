Activité Pratique N°2 – ORM JPA Hibernate Spring Data

Technologies : Java, Spring Boot, Spring Data JPA, Hibernate, H2, Lombok

1. Présentation du projet

Cette activité pratique consiste à développer une application de gestion des produits (Product Management) en utilisant Spring Boot, JPA, Hibernate et Spring Data.

L'objectif est de comprendre le fonctionnement du mapping objet-relationnel (ORM), de manipuler une base de données H2 et de réaliser les opérations CRUD (Create, Read, Update, Delete) à travers une API REST.

2. Technologies utilisées
Java 21 : langage de programmation.
Spring Boot : framework de développement.
Spring Data JPA : gestion de la persistance des données.
Hibernate : implémentation ORM de JPA.
H2 Database : base de données relationnelle en mémoire.
Spring Web : création des API REST.
Lombok : réduction du code répétitif (Getters, Setters, Constructeurs).
Swagger / OpenAPI : documentation et test des API REST.
IntelliJ IDEA Ultimate : environnement de développement.
3. Structure du projet
text
src/
 └── main/
     ├── java/
     │   └── me/mundiapolis/demobdccspringdata/
     │       ├── entities/
     │       │   └── Product.java
     │       ├── repository/
     │       │   └── ProductRepository.java
     │       ├── web/
     │       │   └── ProductRestController.java
     │       └── DemoBdccSpringDataApplication.java
     │
     └── resources/
         └── application.properties

4. Entité JPA Product

L'entité Product représente un produit dans la base de données.

Elle contient les attributs suivants :

Attribut	Type
id	Long
name	String
price	double
quantity	int

L'annotation @Entity permet de mapper cette classe à une table de la base de données.

L'annotation @Id définit la clé primaire et @GeneratedValue permet de générer automatiquement l'identifiant.

5. Configuration de la base de données

La base de données H2 est configurée dans le fichier application.properties.

Hibernate utilise JPA pour gérer automatiquement la création et la mise à jour des tables à partir des entités.

6. Repository Spring Data JPA

L'interface ProductRepository hérite de JpaRepository<Product, Long>.

Elle permet d'effectuer les opérations de persistance sans écrire manuellement les requêtes SQL.

Les principales opérations utilisées sont :

save() : ajouter ou modifier un produit.
findAll() : consulter tous les produits.
findById() : consulter un produit par son identifiant.
findByNameContains() : rechercher des produits par nom.
deleteById() : supprimer un produit par son identifiant.
7. API REST – Opérations CRUD

Le contrôleur ProductRestController expose les endpoints suivants :

Méthode HTTP	Endpoint	Description
GET	/products	Consulter tous les produits
GET	/products/{id}	Consulter un produit par ID
GET	/find/products?kw=laptop	Rechercher des produits par nom
POST	/products	Ajouter un produit
PUT	/products/{id}	Mettre à jour un produit
DELETE	/products/{id}	Supprimer un produit
8. Tester les API avec Swagger

Swagger permet de visualiser et de tester les différents endpoints de l'application.

Après le démarrage de l'application, accéder à :

text
http://localhost:8084/swagger-ui/index.html

Exemple : Ajouter un produit

Méthode : POST

Endpoint : /products

Corps de la requête JSON :

json
{
  "name": "Laptop",
  "price": 7500,
  "quantity": 10
}

Exemple : Consulter tous les produits

Méthode : GET

Endpoint : /products

Exemple : Rechercher un produit

Méthode : GET

Endpoint : /find/products?kw=laptop

Exemple : Supprimer un produit

Méthode : DELETE

Endpoint : /products/1

9. Conclusion

Cette activité pratique m'a permis de découvrir et de mettre en pratique les concepts fondamentaux de JPA, Hibernate et Spring Data.

J'ai appris à créer une entité JPA, configurer une base de données H2, utiliser un repository Spring Data et développer une API REST permettant d'effectuer les opérations CRUD sur les produits.

L'utilisation de Swagger a également facilité la visualisation et le test des différents endpoints de l'application.
