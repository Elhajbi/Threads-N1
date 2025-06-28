# 🧵 Talkative - Exemple de programmation multi-thread en Java

## 📋 Description

`Talkative` est une application simple en Java qui illustre le comportement d'un programme multithread.  
Elle montre comment plusieurs threads peuvent être exécutés simultanément en affichant chacun une série de messages à l'écran.

## 🚀 Fonctionnalités

- Implémentation de l'interface `Runnable`.
- Création de plusieurs threads indépendants.
- Affichage simultané de messages via la méthode `run()`.
- Illustration du comportement non déterministe de l'exécution parallèle.

## 🛠️ Structure du projet

- `Talkative.java` : la classe principale qui implémente `Runnable` et crée les threads dans la méthode `main`.

## 🧪 Comportement attendu

Lors de l'exécution, 10 threads seront lancés.  
Chaque thread affichera **100 messages** contenant son **identifiant unique** (de 1 à 10).

⚠️ L'ordre d'affichage n'est pas garanti car les threads s'exécutent **en parallèle**.  
Ceci démontre l'absence de synchronisation explicite entre les threads.

### Exemple de sortie :
