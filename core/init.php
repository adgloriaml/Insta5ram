<?php
ob_start();

date_default_timezone_set("Africa/Accra");


session_start();

define("WWW_ROOT","http://localhost/instagram/");


require_once "config.php";
require_once "functions.php";


spl_autoload_register(function ($className){
    require_once "classes/".$className.".php";
});

$account=new Account();
$LoadFromUser=new User();
$LoadFromFollow=new Follow();
$LoadFromPost=new Post();
