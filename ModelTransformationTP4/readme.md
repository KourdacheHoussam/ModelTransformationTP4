------------------
 Objectifs


---------------------
L�objectif de ce TP est d�impl�menter en Java/EMF une transformation de mod�le qui, � partir
d�un mod�le UML M produit un mod�le UML M' correspondant � M mais dans lequel on aura
appliqu� � toutes les classes contexte d�une machine � �tats le patron de conception State, ainsi
que vu en TD. On fera les memes suppositions qu�en TD :

* On consid�re qu�une classe ne peut pas avoir plus d�une machine � �tats associ�e.
* On ne s�int�ressera pas � l�h�ritage de machine � �tats.
* On ne manipule que des machines � �tats sans �tats composites ni orthogonaux.
* On ne traitera que la partie statique du patron de conception State. 

Pour la partie dynamique (changement d��tat, d�l�gation vers l��tat, ...), on pourra �ventuellement attacher des
commentaires aux m�thodes concern�es.


Cette transformation est conceptuellement simple, mais n�cessite de r�aliser beaucoup de transformations
interm�diaires (cr�ation de nouvelles classes, de hi�rarchies, d�une association, de m�thodes,
...). 

Il est donc fortement d�conseill� de tenter d��crire l�int�gralit� de cette transformation dans
une seule m�thode java.

Au contraire, il est conseill� de bien d�composer le probl�me en m�thodes
atomiques et �ventuellement r�utilisables dans un autre contexte de transformation impliquant le
m�ta-mod�le UML.


------------------
Le diagramme machine �tats est : tdPatternState.pdf 
Cr�ation du diagramme de classe, g�n�ration du modele, et de son code source java
------------------
 * Cr�ation du diagramme de classe du patron state machine -> fichier StateMachine.ecore_diagram
 * G�n�ration du fichier model ecore StateMachine.ecore
 * Clique droit sur dernier et g�n�ration de StateMachine.genmodel (new->other->emf generator model), puis charger le
   modele StateMachine.ecore (faut absolument que le ecore soit valid� pour ne pas g�n�rer d'erreurs).
 * G�n�ration du code java � partir du fichier StateMachine.genmodel: ouvrir ce dernier et pointer sur la racine
   puis cliquer sur : Generate model code (suivre les autres etapes). cette �tape vous g�n�rera les trois packages de votre 
   modele.
   
   
   