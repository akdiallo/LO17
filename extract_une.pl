#!/usr/bin/perl
### Extract for "la une"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {

	### GET UNE - IBL_ID=27914
	#<a href="mailto:agautier@tf1.fr" class="S14">AFP</a>
	#[mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)]
	### le <\/a> avant le mailto restraint tout. le mailto et auteur sont dans $11
	$line =~ /<UNE>(.*?)href="(.*?)" class="S431"(.*?)>(.*?)<\/a>(.*?)<img src="(.*?)"(.*?)class="S48">(.*?)<img(.*?)> (.*?)<\/a>(.*?)[mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)]<\/UNE>/;
	$titre_article = $4;
	$url_article = $2;
	$url_image = $6;
	$resume_article = $10;
	$mailto = $12;
	$auteur = $13;
}

print "		
		<urlArticle>".$url_article."</urlArticle>
	 	<titreArticle>".$titre_article."</titreArticle>
		<dateArticle></dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto>".$mailto."</mailto>
		<auteur>".$auteur."</auteur>
	";