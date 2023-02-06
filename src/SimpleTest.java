import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void testFindBlockByColor() {
        Block block1 = new SimpleBlock("red", "brick");
        Block block2 = new SimpleBlock("blue", "concrete");
        Wall wall = new Wall(Arrays.asList(block1, block2));
        Optional<Block> foundBlock = wall.findBlockByColor("red");
        assertTrue(foundBlock.isPresent());
        assertEquals("red", foundBlock.get().getColor());
    }

    @Test
    void testFindBlocksByMaterial() {
        Block block1 = new SimpleBlock("red", "brick");
        Block block2 = new SimpleBlock("blue", "concrete");
        Block block3 = new SimpleBlock("green", "brick");
        Wall wall = new Wall(Arrays.asList(block1, block2, block3));
        List<Block> foundBlocks = wall.findBlocksByMaterial("brick");
        assertEquals(2, foundBlocks.size());
        assertEquals("red", foundBlocks.get(0).getColor());
        assertEquals("green", foundBlocks.get(1).getColor());
    }

    @Test
    void testCount() {
        Block block1 = new SimpleBlock("red", "brick");
        Block block2 = new SimpleBlock("blue", "concrete");
        Block compositeBlock = new CompositeBlockImpl(Arrays.asList(
                new SimpleBlock("yellow", "brick"),
                new SimpleBlock("pink", "concrete")
        ));
        Wall wall = new Wall(Arrays.asList(block1, block2, compositeBlock));
        assertEquals(5, wall.count());
    }

    private class SimpleBlock implements Block {
        private String color;
        private String material;

        SimpleBlock(String color, String material) {
            this.color = color;
            this.material = material;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String getMaterial() {
            return material;
        }
    }

    private class CompositeBlockImpl implements CompositeBlock {
        private List<Block> blocks;

        CompositeBlockImpl(List<Block> blocks) {
            this.blocks = blocks;
        }

        @Override
        public List<Block> getBlocks() {
            return blocks;
        }

        @Override
        public String getColor() {
            return null;
        }

        @Override
        public String getMaterial() {
            return null;
        }
    }
}
