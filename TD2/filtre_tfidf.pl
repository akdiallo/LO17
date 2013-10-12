#!/usr/bin/perl

# $fichier = "liste_mots";

# open(FILE,$fichier) or die("Could not open the file.");

# foreach $line (<FILE>) {
# 	#print $line;
# 	chomp();
# 	chomp($line);
# 	$lines = `grep ' $line /' tfidf`;
# 	$total = 0;

# 	@results = split("\n", $lines);
# 	$i = 0;
# 	foreach $l (@results) {
# 		$i = $i+1;
# 		@n = split(" ", $l);
# 		$total = $total + @n[0];
# 	}
# 	if ($i > 0) {
# 		print $total/$i." ".$line."\n";
# 	}
# }


$fichier = "tfidf";

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	chomp();
	chomp($line);

	@results = split(" ", $line);

	$res = `grep " @results[1]"\$ moy_tfidf`;
	#print "grep ' @results[1]'\$ moy_tfidf\n";
	#print $res;
	@moy = split(" ", $res);
	if (@moy[0] > 0.35 && @results[0] > 0.35) {
		### Regenerate le bon tdidf
		#print $line."\n";
	} else {
		### Generate les mots a enlever
		print @results[1]."\n";
	}
}
