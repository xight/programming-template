<?php

// single-line (str)
$stdin = trim(fgets(STDIN));  
var_dump($stdin);

// multi-line
$p = array();
while(true) {
	$stdin = trim(fgets(STDIN));
	if ($stdin === '') {
		break;
	}  
	array_push($p, explode(" ",$stdin));
}
var_dump($p);

// p[0], p[1], p[2]
$p = explode(",",trim(fgets(STDIN)));
var_dump($p);

// 
list($n, $m)  = explode(" ",trim(fgets(STDIN)));
var_dump($n, $m);

/*
n
a_1
a_2
.
a_n
 */
$n = trim(fgets(STDIN));
for ( $i = 0; $i < $n; $i++) {
	$s = trim(fgets(STDIN));
	$s = str_replace(array("\r\n","\r","\n"), '', $s);
}


/*
n
p_11 p_12 p_13 ... (str)
p_21 p_22 p_23 ... (str)
...
p_n1 p_n2 p_n3 ... (str)
 */

$n = trim(fgets(STDIN));
$p = array();
for ( $i = 0; $i < $n; $i++) {
	$s = trim(fgets(STDIN));
	$s = str_replace(array("\r\n","\r","\n"), '', $s);
	array_push($p, explode(" ",$s));
}
var_dump($p);
