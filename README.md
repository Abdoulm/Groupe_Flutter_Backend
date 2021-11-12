# groupeFlutter

API pour le projet Siraba Chariaw (Orange Digital Kalanso)
# Fonctionnement
Pour utliser cette API, il vous faut lancer Xampp en premier et le projet.
Ensuite voici les différentes méthodes :

Lien général : http://localhost:8080/api

  - Ajout d'un panneau : Méthode => POST
  
    Lien d'accès => http://localhost:8080/api/addPanneau
    Votre Body sera alors : Ex:....
    {
      "nom": "indication",
      "photo": "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/France_road_sign_A14.svg/1200px-France_road_sign_A14.svg.png",
      "categorie": "INDICATIONS",
      "description": "Lorem ipsumzljdklzndlkznd",
      "audio": "audio3"
    }
    
  - Récupérer tous les panneaux : Méthode => GET
    Lien d'accès => http://localhost:8080/api/getAllPanneaux
    
  - Récupérer un panneau par ID : Méthode => GET
    Lien d'accès => http://localhost:8080/api/getPanneauById/{donnerID}
    
  - Récupérer un panneau par Catégorie : Méthode => GET
    Lien d'accès => http://localhost:8080/api/getPanneauByCategory/{donnerCategorieID}
    
  - Modifier un panneau : Méthode => PUT
    Lien d'accès => http://localhost:8080/api/updatePanneau/{panneauID}
