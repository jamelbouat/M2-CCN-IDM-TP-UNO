
regles: [
	{   
		nom_regle:	"passer son tour",
		description: "poser une carte passer son oblige le joueur suivant de ne pas jouer sa carte",
		exigences: [ 
					le joueur pose carte-passer-tour-couleur-bleu si meme couleur sur la pile-talon,
					le joueur suivant passe son tour
				  ] 
	},
	{   
		nom_regle:	"poser une carte de meme couleur",
		description:	"poser une carte de meme couleur",
		exigences: [ le joueur pose carte-numero-8-couleur-rouge si meme couleur sur la pile-talon ]
	},
	{   
		nom_regle:	"la variante interception",
		description:	"poser une carte en disant interception",
		exigences: [ le joueur dit interception et pose carte-numero-6-couleur-vert si meme numero sur la pile-talon ]
	}		
]