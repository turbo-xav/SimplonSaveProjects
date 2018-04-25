
****************************************
****************************************
****** Application de diététique *******
****************************************
****************************************

* 1 - Infos utiles *

- Auteur			:	Xavier Tagliarino
-- Mail : xavier.tagliarino@gmail.com
- Date de création	:	20/03/2018

* 2 - Descriptif *

* A - résumé *

Application permettant de gérer des aliments classés par Catégorie

* B - Actions possibles *

* B - 1 Catégorie *
	
	- Afficher
	- Créer
	- Modifier
	- Supprimer des catégories

* B - 2 Aliments * (Si au moins une catégorie existe)
	
	- Afficher les aliments par catégorie avec leur valeur energétique calculée en temps réel
	- Créer un aliment en lui affectant une catégorie
	- Modifier (Si au moins un aliment)
	- Suppimer (Si au moins un aliment)
	
* 3 - Schéma de données *

Cf Fichier "modele.jpg"

* 4 - La base de données

Le moteur utilisé est "Postgresql"

4 - a - Création de la base de données *

Créer une base de données de type "Postgresql" comme suit :

Exécuter les commandes SQL suivantes :

- DROP DATABASE IF EXISTS "dietetique"; 
- CREATE DATABASE "dietetique";
- Exécuter les scripts dans : "create.sql"


4 - b - Paramétrage :
Les coordonées de la base de données sont à paramétrer dans le fichier :config.properties
- Accès : "/src/main/ressources/config.properties"
- Données :
sgbd.driver=org.postgresql.Driver
sgbd.dsn=jdbc:postgresql://localhost:5432/<votrebase>
sgbd.login=<votrelogin>
sgbd.password=<votre mode de passe>

5 - Lancement de l'application

Importer un projet Maven existant via Eclipse 