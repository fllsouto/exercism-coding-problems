def is_isogram(word):
    l_word = list(word)
    for c in l_word:
        if( not(l_word.count(c) == 0) ):
            return 0
    return 1
