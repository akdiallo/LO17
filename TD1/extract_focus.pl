#!/usr/bin/perl
### Extract for "focus"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

$date_article = "";
foreach $line (<FILE>) {
	if ($date_article eq ""){
		$line =~ /(.*?)<date>(.*?)<\/date>(.*?)/;
		$date_article = $2;
	}

	
	 
		$line =~ /<FOCUS>(.*?)<a href="(.*?)"><img src="(.*?)"(.*?)class="S401">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>(.*?)<\/FOCUS>/;
		#mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)
	
	
		$url_article = $2;
		$titre_article = $5;
		$url_image = $3;
		$resume_article = $7;
		$result = $8;
	


}

$result =~ / (.*?)mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)/;
$mailto = $2;
$auteur = $3;

print "	
		<urlArticle>".$url_article."</urlArticle>
		<titreArticle>".$titre_article."</titreArticle>
		<dateArticle>".$date_article."</dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto>".$mailto."</mailto>
		<auteur>".$auteur."</auteur>
	";
		print $date_article;
