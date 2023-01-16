def is_isogram(string):

    l_string = string.lower()
    r_string = l_string.replace(' ', '').replace('-', '')
    return len(r_string) == len(set(r_string))
