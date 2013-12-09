iutvalence-java-mp-2013-2014-in-p5
==================================

Mini-projets Java, IUT de Valence, 2013-2014, groupe IN, projet 5


MOTUS:

Classique


la taille du mot 6 lettres.
première lettre donnée, si mot supérieur au nombre de lettre tour perdu, de même si mot inférieur au nombre de lettre du mot aléatoire, (et si le mot ne veux rien dire)
Si le mot donnée correspond, le joueur gagne, et le mot est afficher en rouge, si le mot donnée contient des lettres bien placé, elles s'affichent en rouge, si elle sont présentes dans le mots, mais pas au bon endroit, alors elles s'affichent en jaune et si elle ne sont pas dant le mot, elles s'affichent en bleu, on a 6 tours pour trouver le mot correspondant.
Trente secondes pour proposer un mot, au bout des trentes secondes, tu perds la main
Si les 6 propositions n'arrivent pas a trouver le mot, alors la main passe a l'équipe adverse, et il on une chance pour trouver le mot
Quatre mots a trouver par équipes, un mot trouvé rapporte 10 point, si après avoir perdu la main au bout des six chances,, récupère une lettre supplémentaire, et une chance pour le trouver, si l'équipe le trouve, elle récupère 20 points, si elle ne le trouve pas, l'équipe ne gagne pas de point, et a la main, pour trouver un nouveau mot.
L'équipe gagnante est celle qui a le plus de points a la fin des 8 mots.

Solo

Le joueur a 2 minutes pour trouver 6 mots
Les mêmes règles que pour le classique s'applique dans se mode de jeu, il peut avoir plus de 6 mots a deviner,
Si il en trouve un, son compteur de mots a deviné se décrémente, et un nouveau mot lui est tiré aléatoirement,
Si il ne trouve pas le mot, le compteur de mots ne se décrémente pas, et un nouveau mot lui est tiré.




Notre application peut lancer un partie de motus 1 joueurs, le joueurs a 10 mot/essai pour en trouver correctement 6,
il a 6 essai par mots.
Si le joueurs les trouve il gagne, sinon il perd.
Tout les affichages on été délocalisé dans une classe qui les gère tous.
