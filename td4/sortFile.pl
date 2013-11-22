#!/usr/bin/perl

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");
my(@lines) = <FILE>;
@lines = sort(@lines); # sort the list
my($item);
%seen = ();
@uniq = ();
foreach $item (@lines) {
  push(@uniq, $item) unless $seen{$item}++;
}
foreach $item (@uniq){
  print "$item"; # print in sort order
  }
close(FILE);


