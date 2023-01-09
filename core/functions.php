<?php

function h($string = "")
{
    return htmlspecialchars($string);
}


function url_for($script)
{
    return WWW_ROOT . $script;
}
function loggedIn()
{
    if (isset($_SESSION['user_id'])) {
        return true;
    } else {
        return  false;
    }
}



/**
 * @param string $string  The input string.
 * 
 * @return string  the encoded string.
 */
function escape($string)
{
    return htmlentities($string, ENT_QUOTES);
}

/**
 * @param $required_fields_array, n array containing the list of all required fields
 * @return array, containing all errors
 */
function check_empty_fields($required_fields)
{
    //initialize an array to store error messages
    $form_errors = array();

    //loop through the required fields array snd popular the form error array
    foreach ($required_fields as $name_of_field) {
        if (!isset($_POST[$name_of_field]) || $_POST[$name_of_field] == NULL) {
            $form_errors[] = $name_of_field . " is a required field.";
        }
    }

    return $form_errors;
}


/**
 * @param $fields_to_check_length, an array containing the name of fields
 * for which we want to check min required length e.g array('username' => 3, 'password' => 4)
 * @return array, containing all errors
 */
function check_min_length($fields_to_check_length)
{
    //initialize an array to store error messages
    $form_errors = array();
    foreach ($fields_to_check_length as $name_of_field => $minimum_length) {
        if (strlen(trim($_POST[$name_of_field])) < $minimum_length) {
            $form_errors[] = $name_of_field . " is too short, must be {$minimum_length} characters long";
        }
    }
    return  $form_errors;
}

/**
 * @param $data, store a key/value pair array where key is the name of the form control
 * in this case 'email' and value is the input entered by the user
 * @return array, containing email error
 */
function check_email($data)
{
    //initialize an array to store error messages
    $form_errors = array();
    $key = 'email';
    //check if the key email exist in data array
    if (array_key_exists($key, $data)) {

        //check if the email field has a value
        if ($_POST[$key] != null) {

            // Remove all illegal characters from email
            $key = filter_var($key, FILTER_SANITIZE_EMAIL);

            //check if input is a valid email address
            if (filter_var($_POST[$key], FILTER_VALIDATE_EMAIL) === false) {
                $form_errors[] = $key . " is not a valid email address";
            }
        }
    }
    return $form_errors;
}

/**
 * @param $form_errors_array, the array holding all
 * errors which we want to loop through
 * @return string, list containing all error messages
 */
function show_errors($form_errors_array)
{
    $errors = "<ul class='form_errors'>";
    //loop through error array and display all items in a list
    foreach ($form_errors_array as $the_error) {
        $errors .= "<li>{$the_error}</li>";
    }
    $errors .= "</ul>";
    return $errors;
}

function log_out_user()
{
    unset($_SESSION['user_id']);
    $_SESSION = array();
    session_destroy();
    return true;
}

function nameShortener($name, $limit)
{
    if (strlen($name) >= $limit) {
        return substr($name, 0, intval($limit) - 2) . "..";
    } else if (strlen($name) < $limit) {
        return $name;
    }
}
