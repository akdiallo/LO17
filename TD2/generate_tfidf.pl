#!/usr/bin/perl

$fichier = "tfij";

open(FILE,$fichier) or die("Could not open the file.");

$prec = '';

foreach $line (<FILE>) {
	#print $line;
	@values = split(" ", $line);
	#print @values[1]." ".@values[0]." ".@values[2]."\n";

	if ($prec ne @values[1]) {
		$res = `grep ^"@values[1] " idfi`;
		@idfi = split("idfi:", $res);
	}

	$produit = @values[0]*@idfi[1];

	print $produit." ".@values[1]." ".@values[2]."\n";

	$prec = @values[1];
}
