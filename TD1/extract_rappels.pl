#!/usr/bin/perl
### Extract for "rappels"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	
	### GET RAPPELS
    $line =~ /<RAPPEL>(.*?)class="S48">(.*?)<\/span>(.*?)class="S301">(.*?)<\/span>(.*?)<a href="(.*?)"(.*?)class="S63">(.*?)<\/a>/;
	$status = $&;
	$date_article = $2;
	$theme_article = $4;
	$url_article = $6;
	$titre_article = $8;
		
	if ($prev ne $status) {
		print "
		<RAPPEL>
	    	<dateArticle>".$date_article."</dateArticle>
	   	 	<themeArticle>".$theme_article."</themeArticle>
			<urlArticle>".$url_article."</urlArticle>
		    <titreArticle>".$titre_article."</titreArticle>
		</RAPPEL>";
	}
	$prev = $status;
}

print "\n	"
