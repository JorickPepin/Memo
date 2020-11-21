<style type="text/css">
    table, td {
        border: 1px solid black;
        padding: 5px;
    }
</style>

<?php
    $NB_CASES = 25;
    $FORMULE = 255 / ($NB_CASES - 1);
    
    echo '<table>';

    for ($i = 0; $i < $NB_CASES; ++$i) {
        echo '<tr>';
        for ($j = 0; $j < $NB_CASES; ++$j) {
            echo '<td style="background-color: rgb(255,'.($i * $FORMULE).','.($j * $FORMULE).')";></td>';
        } 
        echo '</tr>';
    }

    echo '</table>';
?>


