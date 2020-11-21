<?php
    $ANNEE = 1900;

    function estBissextile($annee) {
        return ((($annee % 4 == 0) && ($annee % 100 != 0)) || ($annee % 400 == 0));
    }

    echo estBissextile($ANNEE) ? $ANNEE." est bissextile" : $ANNEE." n'est pas bissextile";
?>


