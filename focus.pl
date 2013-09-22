#!/usr/bin/perl
### Extract for "focus"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {

	### GET LE FOCUS - <!-- Bloc IBL_ID=27913 - "news/NewsAutresArticles" --> Blc=27913 
	#<a href="/news/monde/0,,3287377-VU5WX0lEIDUy,00.html" class="S401">"Le nouvel allié de Bush ? Chirac !"</a>
	#
	#$line =~ /Blc=27913(.*?)<img src="(.*?)" alt(.*?)<a href="(.*?)" class="S401">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>\/Blc=27913/;
	#$line =~ /<!-- Bloc IBL_ID=27913(.*?)<img src="(.*?)" alt(.*?)<a href="(.*?)" class="S401">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a><!-- \/Bloc IBL_ID=27913/;
	$line =~ /<!-- Bloc IBL_ID=27913(.*?)<a href="(.*?)"><img src="(.*?)"(.*?)class="S401">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>(.*?)mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)\/Bloc IBL_ID=27913/;
	$url_article = $2;
	$titre_article = $5;
	$date_article = "";
	$url_image = $3;
	$resume_article = $7;
	$mailto = $9;
	$auteur = $10;
}

print 
"		<urlArticle>".$url_article."</urlArticle>
		<titreAricle>".$titre_article."</titreAricle>
		<dateArticle>".$date_article."</dateArticle>
		<urlImage>".$url_image."</urlImage>
		<resumeArticle>".$resume_article."</resumeArticle>
		<mailto>".$mailto."</mailto>
		<auteur>".$auteur."</auteur>";