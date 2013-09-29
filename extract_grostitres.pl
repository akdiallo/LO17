#!/usr/bin/perl
### Extract for "gros titres"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	
	### GET GROS TITRES
    $line =~ /<GROSTITRE>(.*?)"><img src="(.*?)"(.*?)class="S301">(.*?)<\/span>(.*?)class="S63">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>(.*?)/;
	$status = $&;
	$url_article = "/".$1;
	$theme_article = $4;
	$titre_article = $6;
	$date_article = "";
	$url_image = $2;
	$resume_article = $8;
	$mailto = "";
	$auteur = "";
		
	if ($prev ne $status) {
		print "	
		<GROSTITRE>
			<urlArticle>".$url_article."</urlArticle>
		    <themeArticle>".$theme_article."</themeArticle>
		    <titreArticle>".$titre_article."</titreArticle>
		    <dateArticle>".$date_article."</dateArticle>
		    <urlImage>".$url_image."</urlImage>
		    <resumeArticle>".$resume_article."</resumeArticle>
		    <mailto>".$mailto."</mailto>
		    <auteur>".$auteur."</auteur>
		</GROSTITRE>";
	}
	$prev = $status;
}

print "\n	"