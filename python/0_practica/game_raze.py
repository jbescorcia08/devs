import readchar
import os

POS_X = 0
POS_Y = 1
MAP_WIDTH = 20
MAP_HEIGHT = 15

my_position = [0, 0]
map_odjects = [[4,1],[3,7],[4,1],[12,7],[8,9],[9,12],[6,15],[4,7]]

def clear_screen():
    os.system("cls" if os.name == "nt" else "clear")

while True:
    clear_screen()

    print("+" + "-" * MAP_WIDTH * 3 + "+")

    for coordinate_y in range(MAP_HEIGHT):
        print("|", end="")
        for coordinate_x in range(MAP_WIDTH):
            char_to_draw = " "
            for map_odject in map_odjects:

                if map_odject[POS_X] == coordinate_x and map_odject[POS_Y] == coordinate_y:
                    char_to_draw = "+"

            if coordinate_x == my_position[POS_X] and coordinate_y == my_position[POS_Y]:
               char_to_draw = "@"

            for position in map_odjects:
                if position[my_position[POS_X],my_position[POS_Y]] == map_odjects[POS_X,POS_Y]:
                    map_odjects.remove(position[my_position[POS_X],my_position[POS_Y]])
    
            print(" {} ".format(char_to_draw), end="")

        print("|")

    print("+" + "-" * MAP_WIDTH * 3 + "+")

    # W -> arriba, A -> izquierda, S -> abajo, D -> derecha
    direction = readchar.readchar()
    

    if direction == 'w':
        my_position[POS_Y] -= 1
        my_position[POS_Y] %= MAP_HEIGHT
    elif direction == 'a':
        my_position[POS_X] -= 1
        my_position[POS_X] %= MAP_WIDTH
    elif direction == 's':
        my_position[POS_Y] += 1
        my_position[POS_Y] %= MAP_HEIGHT
    elif direction == 'd':
        my_position[POS_X] += 1
        my_position[POS_X] %= MAP_WIDTH
    elif direction == 'u':
        break
    else:
        print("Solo es válido: W -> arriba, A -> izquierda, S -> abajo, D -> derecha")

