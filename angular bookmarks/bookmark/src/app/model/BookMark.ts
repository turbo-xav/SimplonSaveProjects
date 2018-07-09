import Author from './Author';
import Tag from './Tag';

class BookMark {
    id: String;
    title: String;
    link: String;
    description: String;
    createdAt: String;
    updatedAt: String;
    author: Author;
    tags: Tag[];
}

export default BookMark;
