#!/usr/bin/perl
### Extract for "gros titres"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	
	### GET GROS TITRES
	#from extract_focus.pl
	#(?(?=mailto:)(.*?)" class="S14">(.*?)<\/a>(.*?))
	
	#sort tous les gros titres seulement avec auteur et email
	#mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)
    $line =~ /<GROSTITRE>(.*?)"><img src="(.*?)"(.*?)class="S301">(.*?)<\/span>(.*?)class="S63">(.*?)<\/a>(.*?)class="S48">(.*?)<\/a>(.*?)<\/table>(.*?)/;
	$status = $&;
	$url_article = $1;
	$theme_article = $4;
	$titre_article = $6;
#	$date_article = "";
	$url_image = $2;
	$resume_article = $8;
	$result_date = $result_author = $9;

	$result_date =~ /<span class="S48">\((.*?)\)(.*?)/;
	if ($url_article ne $1){
		$date_article = $1;
		}

	$result_author =~ /(.*?)mailto:(.*?)" class="S14">(.*?)<\/a>(.*?)/;	
		if ($url_image ne $2){
			$mailto = $2;	
			$author = $3;
			}
	

		
	if ($prev ne $status) {
	
		print "	
		<GROSTITRE>
		    <urlArticle>"."/".$url_article."</urlArticle>
		    <themeArticle>".$theme_article."</themeArticle>
		    <titreArticle>".$titre_article."</titreArticle>
		    <dateArticle>".$date_article."</dateArticle>
		    <urlImage>".$url_image."</urlImage>
		    <resumeArticle>".$resume_article."</resumeArticle>
		    <mailto>".$mailto."</mailto>
		    <auteur>".$author."</auteur>
		</GROSTITRE>";
		
		$date_article = "";
		$mailto = "";
		$author = "";
		$url_article = "";
		$url_image = "";

	}
	$prev = $status;
}

print "\n	";

