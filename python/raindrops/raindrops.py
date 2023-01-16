def convert(number):
    drops = ((3, "Pling"), (5, "Plang"), (7, "Plong"))
    sounds = [s for f, s in drops if number % f == 0 ]
    return "".join(sounds) or str(number)