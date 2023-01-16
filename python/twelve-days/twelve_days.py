days = {
    1: 'first',
    2: 'second',
    3: 'third',
    4: 'fourth',
    5: 'fifth',
    6: 'sixth',
    7: 'seventh',
    8: 'eighth',
    9: 'ninth',
    10: 'tenth',
    11: 'eleventh',
    12: 'twelfth',
}

verses = {
    1:  "a Partridge in a Pear Tree.",
    2:  "two Turtle Doves, ",
    3:  "three French Hens, ",
    4:  "four Calling Birds, ",
    5:  "five Gold Rings, ",
    6:  "six Geese-a-Laying, ",
    7:  "seven Swans-a-Swimming, ",
    8:  "eight Maids-a-Milking, ",
    9:  "nine Ladies Dancing, ",
    10: "ten Lords-a-Leaping, ",
    11: "eleven Pipers Piping, ",
    12: "twelve Drummers Drumming, "
}
def recite(start_verse, end_verse):
    songs = []
    for day in range(start_verse, end_verse + 1):

        song = "On the {} day of Christmas my true love gave to me: ".format(days[day])
        
        for i in range(day, 1, -1):
            song += verses[i]
        
        if (day > 1):
            song += "and "
        
        song += verses[1]
        songs.append(song)
    
    return songs

 
 
 
 
 
 
 
 


