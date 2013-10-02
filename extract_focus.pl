#!/usr/bin/perl
### Extract for "focus"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {

#[mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)]
	$line =~ /<FOCUS>(.*?)<a href="(.*?)"><img src="(.*?)"(.*?)class="S401">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>(.*?)(?(?=mailto:)(.*?)" class="S14">(.*?)<\/a>(.*?))<\/FOCUS>/;
	#mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)
	$url_article = $2;
	$titre_article = $5;
	$date_article = "";
	$url_image = $3;
	$resume_article = $7;
	$mailto = $9;
	$auteur = $10;
}

print "	
		<urlArticle>".$url_article."</urlArticle>
		<titreArticle>".$titre_article."</titreArticle>
		<dateArticle>".$date_article."</dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto>".$mailto."</mailto>
		<auteur>".$auteur."</auteur>
	";
