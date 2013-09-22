#!/usr/bin/perl
### Extract for "la une"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {

	### GET UNE - IBL_ID=27914
	$line =~ /<!-- Bloc IBL_ID=27914 - "GeneralOuvre" -->(.*?)href="(.*?)" class="S431"(.*?)>(.*?)<\/a>(.*?)<img src="(.*?)"(.*?)class="S48">(.*?)<img(.*?)> (.*?)<\/a>(.*?)\/Bloc IBL_ID=27914/;
	$titre_article = $4;
	$url_article = $2;
	$url_image = $6;
	$resume_article = $10;
}

print 
"		<urlArticle>".$url_article."</urlArticle>
	 	<titreArticle>".$titre_article."</titreArticle>
		<dateArticle></dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto></mailto>
		<auteur></auteur>";
