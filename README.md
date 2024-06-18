# marcheur

Un **Marcheur** peut `marcher()`, avec deux paramètres: un **lieu de départ** et un **lieu d'arrivée**.

Il n'a pas besoin de carte, il choisit un lieuAdjacent de manière aléatoire lorsqu'il se situe dans un lieu.
Le `lieuAdjacent` où il ira, à travers son index de manière random.

Pour ne pas utiliser de carte contenant les lieux et les rues auquels elles sont reliés. 
Il faut qu'un lieu, soit construit de manière à ce que le lieu **possède des** `lieuxAdjacents` **de lui même**, et non au dépend d'une carte.

De cette manière le marcheur.marche() en commencant par son lieu de départ, et en choisissant de manière aléatoire son index, menant à un autre lieu, jusqu'à ce qu'il arrive à son lieu d'arrivée.

---

## Pour expliquer très simplement le raisonnement
- un marcheur se situe dans un lieu
- il a le choix entre gauche ou droite
- un pile ou face décidera de la direction où il ira
- emprunte la direction (gauche par exemple pour pile)
- en arrivant dans ce nouveau lieu, il refait un pile ou face
- et indefiniment jusqu'à ce qu'il arrive au lieu d'arrivée voulu.