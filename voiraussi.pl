#!/usr/bin/perl
### Extract for "voir aussi"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {

	### GET VOIR AUSSI - IBL_ID=27914 - A voir aussi :
	$line =~ /A voir aussi :(.*?)href="(.*?)" class="S48">(.*?)\((.*?)\)<\/a>(.*?)<\/span>(.*?)<\/span>/;
	$date_article = $4;
	$url_article = $2;
	$titre_article = $3;
}

print 
"		<dateArticle>".$date_article."</dateArticle>
		<urlArticle>".$url_article."</urlArticle>
		<titreAricle>".$titre_article."</titreAricle>";
