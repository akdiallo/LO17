#!/usr/bin/perl
### Extract for "la une"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {


	if ($date_article eq ""){
		$line =~ /(.*?)<date>(.*?)<\/date>(.*?)/;
		$date_article = $2;
	}
 
	### GET UNE - IBL_ID=27914

	$line =~ /<UNE>(.*?)href="(.*?)" class="S431"(.*?)>(.*?)<\/a>(.*?)<img src="(.*?)"(.*?)class="S48">(.*?)<img(.*?)> (.*?)<\/a>(.*?)<\/UNE>/;
	$titre_article = $4;
	$url_article = $2;
	$url_image = $6;
	$resume_article = $10;
	$result = $11;
}

	$result =~ / (.*?)mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)/;
	$mailto = $2;
	$auteur = $3;
	
print "		
		<urlArticle>".$url_article."</urlArticle>
	 	<titreArticle>".$titre_article."</titreArticle>
		<dateArticle>.$date_article.</dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto>".$mailto."</mailto>
		<auteur>".$auteur."</auteur>
	";
