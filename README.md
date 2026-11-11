# Abstract Factory

Ce projet illustre le patron de conception **Abstract Factory**, qui permet de creer des familles de produits coherentes sans connaitre leurs classes concretes. Il contient l'exemple generique du cours (`cours`) et une variante de themes d'interface sombre/clair (`variante`).

## Executer dans VS Code

1. Installer un JDK et l'extension **Extension Pack for Java**.
2. Ouvrir le dossier du projet dans VS Code.
3. Ouvrir l'une des classes principales :
   - `src/cours/Client.java`
   - `src/variante/ClientVariante.java`
4. Cliquer sur **Run** au-dessus de la methode `main`.

## Executer en ligne de commande (PowerShell)

Depuis la racine du projet, compiler les sources :

```powershell
javac -d bin (Get-ChildItem -Recurse src -Filter *.java | ForEach-Object FullName)
```

Lancer l'exemple du cours :

```powershell
java -cp bin cours.Client
```

Ou lancer la variante des themes :

```powershell
java -cp bin variante.ClientVariante
```
