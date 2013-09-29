#!/usr/bin/perl
### Extract for "voir aussi"

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	
	### GET VOIR AUSSI - IBL_ID=27914 - A voir aussi :
    $line =~ /<VOIRAUSSI>(.*?)\/(.*?).html(.*?)class="S48">(.*?) \((.*?)\)<\/a>(.*?)/;
	$status = $&;
	$date_article = $5;
	$url_article = "/".$2.".html";
	$titre_article = $4;
	if ($prev ne $status) {
		print "		
		<VOIRAUSSI>
			<dateArticle>".$date_article."</dateArticle>
			<urlArticle>".$url_article."</urlArticle>
			<titreArticle>".$titre_article."</titreArticle>
		</VOIRAUSSI>";
	}
	$prev = $status;
}

print "\n	"